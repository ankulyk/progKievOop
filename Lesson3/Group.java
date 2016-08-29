package progKievOop.Lesson3.Homework;

import java.util.Arrays;
import java.util.Comparator;

public class Group {
    private String groupName;
    private Student[] group = new Student[10];

    public Group(String groupName, Student[] group) {
        this.groupName = groupName;
        this.group = group;
    }

    public Group() {
    }

    public Student[] getGroup() {
        return group;
    }

    public void setGroup(Student[] group) {
        this.group = group;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < group.length; i++) {
            if (group[i] == null) {
                System.out.println("free");
            } else {
                System.out.println(group[i]);
            }
        }
        return sb.toString();
    }

    public void sortGroup() {
        try {
            Arrays.sort(group, new Comparator<Student>() {
                public int compare(Student st1, Student st2) {
                    if (st1 == null && st2 == null) {
                        return 0;
                    } else {
                        if (st1 == null) {
                            return 1;
                        } else {
                            if (st2 == null) {
                                return -1;
                            }
                        }
                    }
                    return st1.getLastName().compareToIgnoreCase(st2.getLastName());
                }
            });
        } catch (NullPointerException i) {
        }
    }

    public void addStudent(Student student) {
        try {
            boolean IsStudentAdd = false;
            for (int i = 0; i < group.length; i++) {
                if (group[i] == null) {
                    group[i] = student;
                    student.setStudentNumber(++i);
                    IsStudentAdd = true;
                    break;
                }
            }
            if (IsStudentAdd == false) {
                throw new GroupIsFullExeption();
            }
        } catch (GroupIsFullExeption e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteStudent(String lastName) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] == null) {
                continue;
            }
            if (group[i].getLastName().equalsIgnoreCase(lastName)) {
                group[i] = null;
            }
        }
    }

    public void findStudent(String lastName) {
        boolean resultFindStudent = false;
        for (int i = 0; i < group.length; i++) {
            if (group[i].getLastName().equals(lastName)) {
                System.out.println(group[i]);
                resultFindStudent = true;
                break;
            } else {
                System.out.println("This student is not in the group.");
            }
        }
    }
}
