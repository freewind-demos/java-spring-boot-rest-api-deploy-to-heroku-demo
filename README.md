Java Spring Boot Rest Api Deploy to Heroku Demo
==============================

使用Heroku可以方便得把我们的Java应用部署到线上，过程比较简单：

1. 注册heroku帐号
2. 必须在本地添加一个`Procfile`，写上用于heroku执行的命令，如: `web: java -jar target/demo-0.0.1-SNAPSHOT.jar`
3. 必须在`application.properties`中指定内部端口号，如：`server.port=${PORT:5000}`，但我们最终访问的其实还是`80`
3. `./mvnw clean package; heroku local:start`用于测试本地是否可以正常运行
4. `heroku create`，创建一个heroku服务，得到相应的url。可能会提示登录。它会在本地git添加`heroku`这个origin
5. `git push heroku master`，把代码提交到heroku的地址，并自动部署
6. `heroku open`打开url，可以访问啦！

正常情况会自动打开如`https://agile-coast-16382.herokuapp.com/`这样的url，然后页面上看到`Hello!`

如果出错，可以运行`heroku logs --tail`查看日志
