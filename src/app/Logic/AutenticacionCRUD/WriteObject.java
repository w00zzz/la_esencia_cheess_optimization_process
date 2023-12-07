package app.Logic.AutenticacionCRUD;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class WriteObject {
    private String filePath;

    public WriteObject(String filePath){
        this.filePath = filePath;
    }

    public void Write(ArrayList<?> list){
        try {
            File file = new File(filePath);
            if (!file.exists()){
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(list);

            oos.close();
            fos.close();

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
