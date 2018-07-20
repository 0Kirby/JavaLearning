package exceptionLearning;

public class Student {
	
	private String mName;   //姓名
	private int mAge;       //年龄
    //其它方法，代码略
    /*为姓名赋值的方法*/
    public void setName(String name) { this.mName = name; }

    /*为年龄赋值的方法，该方法有可能抛出异常*/
    public void setAge(int age) throws AgeException
    {
        if (age < 0 || age > 100)
        {
            throw (new AgeException());
        }
        mAge = age;
    }
    //其它方法，代码略

	public String display() {
		return "Student [mName=" + mName + ", mAge=" + mAge + "]";
	}
}