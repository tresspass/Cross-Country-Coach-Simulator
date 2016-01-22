public class Saver(){
  String name;
  File file;
  File fileDir;
  Path path;
  public Saver(String name, String data){
    this.name = name;
    path = System.getenv("APPDATA");
  }
  public void Save(){
    fileDir = new File(path);
    if(!file.exists){
      createDir();
    }else if(file.exists){
      if(file.exists){
        
      }
    }else{
      return;
    }
  }
  public void createDir(){
    try{
      new File(path).mkdir();
    }catch(){
      throw new Error("Error creating directory. Path: "+ path + " not found");
    }
      
    }
}
