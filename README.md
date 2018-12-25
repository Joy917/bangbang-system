# base-frame
棒棒论坛后台

# 框架：
- Spring Boot 2.x
- Hibernate
- MariaDB 10.2

# 注意事项：
- 【强制】使用 idea 开发，并保持代码格式化一致，避免冲突，详见[IDEA详细配置](https://blog.csdn.net/qq_35221523/article/details/85239867)
- 插件安装并启用：
	1. 代码格式插件:google-coding-style
	2. 自动保存插件:save action（Formatting actions栏需要全部勾选，General栏勾选最长一个）
- 编码规范：
	1. 【强制】POJO类属性不允许命名为is开头，一律用后缀Flag替换
	2. 【强制】POJO类布尔属性使用基本类型 boolean，其余使用封装类型
	3. 【强制】使用常量代替魔鬼数字
	
- 数据库规范：
	1. 【强制】添加外键影响灵活性，结项时统一
	2. 【建议】建表规范：
		- 主键：id 类型：BITINT
		- 创建时间：create_time 类型：DATETIME
		- 修改时间：modified_time 类型：DATETIME
		- 删除标识：delete_flag 类型：BIT
	3. 【强制】 标识为 0 = false，1 = true

具体参照：《阿里巴巴开发手册》 

