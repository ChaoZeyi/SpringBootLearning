# Spring Boot

Spring Boot可以看作是SpringMVC的升级版。根据统计，Spring Boot的流行程度已经超过了SpringMVC，是下一代框架。

**特点**：

1. 化繁为简，简化配置（很重要！！！SSM中的配置太繁琐了）
2. 是一种微服务的入门级框架

### 配置文件

#### 配置文件的类型

IDEA默认生成的是application.properties，有一种更简便的配置类型为application.yml：

![properties.png](https://github.com/ChaoZeyi/SpringBootLearning/blob/master/images/properties.png?raw=true)

区别在于：.yml中相同前缀的配置不需要重复书写，有自己的一套书写语法。IDEA对.yml的兼容性很好，但需要注意，`：`和值之间一定要有一个空格。

#### 不同环境的配置

在开发环境和生产环境下，可能存在一些配置有所不同，为了减少我们修改配置的工作量，我们可以新建两份配置文件：application-dev.yml和application-prod.yml，然后在application.yml中选择启用哪种环境：`spring.profiles.active=prod`

#### 配置文件的特点

- 在配置文件中不需要关心变量的类型，不管是整型还是字符串都不需要加引号，字符串的拼接也不需要用`+`；
- 可以在配置文件中嵌套配置属性
- 同一前缀的属性，可以写为一个类，将各属性作为该类的私有变量，并提供getter和setter方法

### 常用注解

- **@Value("${age}")**

  变量

- **@Component @ConfigurationProperties(prefix = "girl")**

  将配置文件的前缀作为一个类

- **@Controller @RestController**

  @RestController等同于@Controller与@ResponseBody的组合，用于返回JSON数据

- **@RequestMapping**

  当多个URL都对应一个函数时，可以使用集合value={"hello", "hi"}

- **@PathVariable**

  获取URL中的数据

- **@RequestParam**

  获取请求参数的数据

- **@RequestBody**

  当包含多个请求参数时，最好用一个VO把要传递的JSON数据封装起来

- **GetMapping**

  组合注解，表示请求方法为GET的RequestMapping，相对应的还有PostMapping

### 数据库操作

通过与Mybatis整合，可以很方便地对数据库进行操作，相比于SSM，配置简单的多。我这里就不具体讲他们的整合配置了，在[这里](https://github.com/ChaoZeyi/myWebsite/blob/70ce00fd0977761240d913bcb3296e1d35175d76/articles/2017.12/SpringBoot+Mybatis.md)我做了详细介绍，大家有兴趣可以看一下。

### RESTful APIs

GET		/girls		获取女生列表

POST	/girls		创建一个女生

GET		/girls/id		通过id查询一个女生

POST	/girls/id		通过id更新一个女生

DELETE	/girls/id		通过id删除一个女生