package java_8.Lambda;

import java.io.*;

interface MyInterface{
    void hello(String name);
}

public class MyImp implements MyInterface{
    @Override
    public void hello(String name) {
        System.out.println("Hello "+name);
    }
}
class SerializationDeserialization{
    private static void serialize(Serializable obj,String outputPath)throws IOException
    {
        File outputFile = new File(outputPath);
        if(!outputFile.exists())
        {
            outputFile.createNewFile();
        }
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(outputFile)))
        {
            outputStream.writeObject(obj);
        }
    }
    private static Object deserialize(String inputPath)throws IOException ,ClassNotFoundException
    {

            File inputFile = new File(inputPath);
            try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(inputPath)))
            {
                return inputStream.readObject();
            }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        String path =".";
        serialize(MyImp.class,path);
        System.out.println("Serialized class to "+path);
        Class<?> myImplClass =  (Class<?>)deserialize(path);
        MyInterface instance = (MyInterface)myImplClass.newInstance();
        System.out.println(instance);


    }
}
