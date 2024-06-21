package iOStreamDemo;

import java.nio.charset.StandardCharsets;

public class IOStreamDemo {
    public static void main(String[] args) {
        String path = "src/main/resources/abc.txt";

        byte[] bytes = "Java Core".getBytes(StandardCharsets.UTF_8);
        // append là true: Ghi nối tiếp với nội dung có sẵn trong file
        IOManager.writeFile(path,bytes, true);
        IOManager.writeFile(path,bytes, true);
        // append là false: Ghi đè file => Dữ liệu trước đó mất
        IOManager.writeFile(path,bytes, false);

        byte[] output = IOManager.readFile(path);
        if (output!=null){
            String content = new String(output);
            System.out.println(content);
        }

        Account account = new Account(1,"Loc","12345678");
        IOManager.writeObject(path,account,false);
        Account saveAccount = (Account) IOManager.readObject(path);
        System.out.println(saveAccount);

    }
}
