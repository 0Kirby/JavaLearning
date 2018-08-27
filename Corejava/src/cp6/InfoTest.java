package cp6;

import java.io.File;
import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

public class InfoTest
{
   public static void main(String[] args)
   {
       getMemInfo();
       System.out.println();
       getDiskInfo();
   }
   
   public static void getDiskInfo()
   {
       File[] disks = File.listRoots();
       for(File file : disks)
       {
           System.out.print(file.getPath() + "    ");
           System.out.print("����δʹ�� = " + file.getFreeSpace() / 1024 / 1024 + "M" + "    ");
           System.out.print("�Ѿ�ʹ�� = " + file.getUsableSpace() / 1024 / 1024 + "M" + "    ");
           System.out.print("������ = " + file.getTotalSpace() / 1024 / 1024 + "M" + "    ");
           System.out.println();
       }
   }
   
   public static void getMemInfo()
   {
       OperatingSystemMXBean mem = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
       System.out.println("ȫ���ڴ棺" + mem.getTotalPhysicalMemorySize() / 1024 / 1024 + "MB");
       System.out.println("�����ڴ棺" + mem.getFreePhysicalMemorySize() / 1024 / 1024 + "MB");
   }

}