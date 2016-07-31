# JavaRefect
JavaRefect Basis

首先我们通过Class.forName的形式加载了一个类的全限定名，
那么JDK的类加载器就会去对应的包到它，用newInstance代表生成一个类的实例（如果方法有构造参数的需要另写）
然后通过类去获取sayHello方法，这里的getMethod，第一个为方法名称，后面的是参数类型，（可以是多个）
最后使用method.ivoke去反射方法，第一个是类对象，第二个是参数，也可以多个。这相当于对象调用了一次sayHello方法。
