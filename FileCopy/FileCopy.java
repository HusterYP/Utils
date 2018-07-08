import java.io.File;
import java.nio.file.Files;

/*********************************************
 * 文件复制
 * 需要将right中的合格文件复制到temp文件夹中，
 * 并改名为error中对应文件名，并删除right中对应文件
 * *******************************************/

public class FileCopy {
//    private static String origin = "work" + File.separator + "00302";
//    private static String target = "work" + File.separator + "00303";
//    private static String result = "work" + File.separator + "new";
    private static String origin = "D:\\HusterYP\\SeedClass\\Work\\copy\\error\\";
    private static String target = "D:\\HusterYP\\SeedClass\\Work\\copy\\right\\";
    private static String result = "D:\\HusterYP\\SeedClass\\Work\\copy\\temp\\";

    public static void main(String[] args) {
        File originFile = new File(origin);
        File targetFile = new File(target);
        String[] originList = originFile.list();
        String[] targetList = targetFile.list();
        for (int i = 0; i < Math.min(originList.length, targetList.length); i++) {
            copyTo(originList[i], targetList[i]);
        }
    }

    public static void copyTo(String originName, String targetName){
        File targetFile = new File(target+File.separator+targetName);
        File resultFile = new File(result+File.separator+originName);
        try {
            Files.copy(targetFile.toPath(),resultFile.toPath());
            targetFile.delete();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}