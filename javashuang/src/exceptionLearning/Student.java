package exceptionLearning;

public class Student {
	
	private String mName;   //����
	private int mAge;       //����
    //����������������
    /*Ϊ������ֵ�ķ���*/
    public void setName(String name) { this.mName = name; }

    /*Ϊ���丳ֵ�ķ������÷����п����׳��쳣*/
    public void setAge(int age) throws AgeException
    {
        if (age < 0 || age > 100)
        {
            throw (new AgeException());
        }
        mAge = age;
    }
    //����������������

	public String display() {
		return "Student [mName=" + mName + ", mAge=" + mAge + "]";
	}
}