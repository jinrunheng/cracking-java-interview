#### 抽象类中的抽象方法可以被声明为`protected`修饰的吗？`private`修饰可以吗？

答：

抽象类中的成员变量可以被`public`,`protected`,`default`,`private` 四种修饰符所修饰

抽象类中的抽象方法只能被`public`,`protected`,`default`三种修饰符所修饰

所以，抽象方法可以被`protected`修饰符修饰，但是不能被`private`修饰符修饰



注意：

抽象类设计的目的就是为了让其他类继承的，继承了抽象类的具体类需要实现抽象类的抽象方法；所以，**抽象类中不能有`static`，`final`，`private`修饰的抽象方法**

