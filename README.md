# DesignPatterns
设计模式代码实现

## 创建型模式
### 简单工厂模式designpatterns\simpleFactoryPattern\
#### 优缺点
- 优点：类的创建托管于工厂，用户只需要传入参数就可以得到一个产品，不需要知道怎么创建和返回的是哪个产品。
- 缺点：产品的增加需要改动工厂的代码，如果产品太多工厂中代码逻辑将会很复杂，不利于扩展和维护。

#### 使用环境
工厂类负责创建的对象比较少。客户端只知道传入工厂类的参数，对于如何创建对象不关心。
