#### `Comparable`和`Comparator`接口有什么区别？

答：

- `Comparable`接口

  `Comparable`翻译过来的含义是： **可比较的** 

  也就是说，如果一个类实现了`Comparable`接口，那么就意味着该类有既定的比较规则，支持排序，而不需要指定比较器。

  我们常用的`Integer`，`String`等一些类实现了`Comparable`接口，这也就意味着`Integer`，`String`都是可排序的。

  实现`Comparable`接口的类的必须实现`int compareTo(T o)`方法

  该类的对象可以通过：

  ```
  x.compareTo(y)
  ```

  来比较`x`和`y`的大小。

  如果返回负数，则意味着`x`小于`y`

  如果返回零，则意味着`x`等于`y`

  如果返回正数，则意味着`x`大于`y`

  

- `Comparator`接口

  ​	`Comparator`翻译为比较器。如果说，我们需要控制某个类的次序，而该类本身不支持排序(即没有实现`Comparable`接口)

  那么，我们可以通过“实现`Comparator`类来新建一个比较器”,人为地制定一个”比较规则“，然后通过该比较器对类进行排序。

  实现`Comparator`接口必须实现`int compare(T o1,T o2)`方法,其原则和`Comparable`接口的`compareTo()`方法是一样的。



示例程序：

**示例1**：有`Integer`类型的数组：

`Integer[] arr = new Integer[]{3,4,5,10,2,1,6};`

对其进行正序与倒序排序



因为`Integer` 实现了`Comparable`接口，我们可以直接使用`Arrays.sort()`方法，`Arrays.sort()`默认为从小到大排序

```java
// 正序排序
Arrays.sort(arr);
```

如果想要实现倒序排序,我们需要重新定义比较器；或者，因为`Integer`实现了`Comparable`接口，我们可以直接使用`Collections.reverseOrder()` 返回一个倒序的比较器

```java
// 1. 倒序排序
Arrays.sort(arr, new Comparator<Integer>() {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
});

// 2. 前面的程序可以使用 Lambda 表达式进行简化
Arrays.sort(arr, (o1, o2) -> o2 - o1);

// 3. 因为 Integer 实现了 Comparable 接口，我们可以直接使用 Collections.reverseOrder() 返回一个倒序的比较器
Arrays.sort(arr, Collections.reverseOrder());
```

**示例2**：

已知`Student`类

```java
public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    
    public static void main(String[] args) {
        Student s1 = new Student(3,"Jack");
        Student s2 = new Student(7,"Rose");
        Student s3 = new Student(1,"Jerry");
        Student s4 = new Student(9,"Tom");
        Student[] students = {s1,s2,s3,s4};
    }
}
```

请对`students`数组按照`id`升序及降序进行排序

答：

第一种方法：

```java
import java.util.Arrays;
import java.util.Comparator;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    // 按照学生id由小到小大
    public static class IdAscendingComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.id - o2.id;
        }
    }

    // 按照学生id由大到小
    public static class IdDescendingComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o2.id - o1.id;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(3, "Jack");
        Student s2 = new Student(7, "Rose");
        Student s3 = new Student(1, "Jerry");
        Student s4 = new Student(9, "Tom");
        Student[] students = {s1, s2, s3, s4};

        // 升序排序
        Arrays.sort(students, new IdAscendingComparator());
        // 降序排序
        Arrays.sort(students, new IdDescendingComparator());
    }
}
```

第二种方法：

```java
import java.util.Arrays;
import java.util.Comparator;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student s1 = new Student(3, "Jack");
        Student s2 = new Student(7, "Rose");
        Student s3 = new Student(1, "Jerry");
        Student s4 = new Student(9, "Tom");
        Student[] students = {s1, s2, s3, s4};

        // 升序排序
        Arrays.sort(students, Comparator.comparingInt(o -> o.id));
        // 降序排序
        Arrays.sort(students, (o1, o2) -> o2.id - o1.id);
    }
}

```

第三种方法：

让`student`类实现`Comparable`接口，让其成为一个有比较规则的类

```java
import java.util.Arrays;
import java.util.Collections;


public class Student implements Comparable<Student>{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student s1 = new Student(3, "Jack");
        Student s2 = new Student(7, "Rose");
        Student s3 = new Student(1, "Jerry");
        Student s4 = new Student(9, "Tom");
        Student[] students = {s1, s2, s3, s4};

        // 升序排序
        Arrays.sort(students);
        // 降序排序
        Arrays.sort(students, Collections.reverseOrder());
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }
}
```

