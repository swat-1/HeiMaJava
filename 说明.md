# Tedu
Hello java
解决方法：

第一步：设置全局代理

git config --global http.proxy http://127.0.0.1:1080

git config --global https.proxy http://127.0.0.1:1080

第二步：取消全局代理

git config --global --unset http.proxy

git config --global --unset https.proxy


问题解决。