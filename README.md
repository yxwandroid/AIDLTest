# AIDLTest
进程间通信学习

使用步骤
1 创建需要序列话的对象
2 定义aidl文件 引入序列号的对象
3 定义通信的aidl文件
4 客户端进行service的绑定操作 创建serviceConnection对象和service进行绑定 在serviceConnection中进行调用方法
5 服务端 进行IBinder的 onBind操作创建stub对象进行逻辑处理之后进行数据的返回
