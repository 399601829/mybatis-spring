Spring����MyBatis

1���ڿ���̨��¼��ʵ��sql���
1.1��ʹ��log4jdbc������
	1.1.1�����log4jdbc��jar
	<dependency>
			<groupId>log4jdbc</groupId>
			<artifactId>log4jdbc4</artifactId>
			<version>1.2</version>
	</dependency>
	<dependency>
			<groupId>log4jdbc</groupId>
			<artifactId>log4jdbc4</artifactId>
			<version>1.2</version>
	</dependency>
	<dependency>
			<groupId>org.slf4j</groupId>
			<artifactId>slf4j-api</artifactId>
			<version>1.6.6</version>
	</dependency>
	<dependency>
			<groupId>org.slf4j</groupId>
			<artifactId>slf4j-log4j12</artifactId>
			<version>1.6.6</version>
	</dependency>
	<dependency>
			<groupId>org.slf4j</groupId>
			<artifactId>slf4j-jdk14</artifactId>
			<version>1.5.8</version>
	</dependency>
	1.1.2���ο�src/main/resources/log4j.properties�����ļ�
	1.1.3���޸�jdbc��driver��jdbc url���ο�src/main/resources/applicationContext.xml��
		<property name="driverClassName" value="net.sf.log4jdbc.DriverSpy"></property>
		<property name="url" value="jdbc:log4jdbc:mysql://localhost:3306/mybatis"></property>
1.2��ʹ��p6spy������		
	1.2.1�����p6spy��jar
		<dependency>
			<groupId>p6spy</groupId>
			<artifactId>p6spy</artifactId>
			<version>1.3</version>
		</dependency>
	1.2.2���ο�src/main/resources/spy.properties
	1.2.3����������ļ���Ϣ
		<property name="driverClassName" value="com.p6spy.engine.spy.P6SpyDriver"></property>
		<property name="url" value="jdbc:mysql://localhost:3306/mybatis"></property>
