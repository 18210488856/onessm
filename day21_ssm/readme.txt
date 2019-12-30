ssm框架整合：

前期准备：导入jar包，导入配置文件



一. dao层
   1.导入jar包
   2.配置文件：
      mybatis-config.xml(SqlMapperConfig.xml)
      AccountMapper.xml
      application-dao.xml(dao层的bean配置文件)
      log4j.properties
      db.properties

   3. 在application-dao中
      1引入 db.properties文件
      2创建驱动对象,设置四个属性
      3在SqlSessionFactoryBean 会话工厂中
          1)设置dataSource
          2)加载mybatis-config.xml文件
          3)设置别名 pojo
          4)加载映射文件(这一步省略)
   4. 配置映射器Mapper, 用于扫描mapper文件,返回动态代理对象,并加载对应.xml文件

   5.创建junit测试

二. service层
   1. 创建一个接口,写一个转账的方法,对应写实现类
   2. 创建application-service.xml
   3. 包扫描 service 目录
   4. 创建平台事务管理器,  然后注解驱动  <tx:annotation-driven transaction-manager="transactionManager"/>
   5. 给service类加事务
   6. 创建junit测试

三. controller 层
   1.创建springmvc.xml,因为service还有dao的配置文件需要加载,所有我们需要加载ServiceContext
     1) 包扫描
     2) 手动创建三大组件, HandlerMapping与HandlerAdapter 使用注册驱动, ViewReSolver 配置时,配置前缀,后缀

   2. 在web.xml中 加载前端控制器, 配置 加载时机
      1) 加载 ServiceContext ,赋初始化值
      2) 配置监听器,监听ServiceContext,一加载,就把配置的初始化配置文件,保存到WebServiceContext中
   3. 创建AccountController类,创建对应的方法

   4. 创建jsp页面
