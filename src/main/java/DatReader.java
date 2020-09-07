import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DatReader {

  VehicleFactory vehicleFactory =new VehicleFactory();
  List<Vehicle> vehicleList = new ArrayList<>();
  List<String> pathNames = new ArrayList<>();

  /*Feladat:
Objektum orinentáltan írj egy egyszerű programot két függvénnyel. Mindenképpen használd ki az objektum orientáltságot!

1:
- olvassa be a data mappában (és esetleges almappáiban) lévő fájlokban található adatokat (minta mappa csatolva egy zip fájlban)
- minden fájlban JSON adatszerkezet található, az ID a fájl neve
- a típus alapján példányosítsd a megfelelő közlekedési típust (csak az a két típus lehetséges, amit látsz)
- a kapott objektumot tedd bele egy listába
- menet közben írja ki képernyőre, hogy a program fut és dolgozik (nem kell homokóra vagy ilyesmi, egy egyszerű jelzés)

2:
- a kapott listában található elemeket írd ki a képernyőre*/

  public List<String> loadFile(String path, List<String> list) {
    File folder = new File(path);
    String[] folders = folder.list();
    if (folders != null) {
      for (String fold : folders) {
        if (!fold.endsWith(".dat")) {
          loadFile(path +"/"+ fold,list);
        } else {
          list.add(path +"/"+ fold);
        }
      }
    }
    return list;
  }


  public List<Vehicle> convertDatToObject() {
    pathNames = loadFile("src/main/resources/data",pathNames);
      for(String pathName: pathNames) {
        try {
          byte[] data = Files.readAllBytes(Paths.get(pathName));
          String json = new String(data, StandardCharsets.UTF_8);
          json.getBytes(StandardCharsets.UTF_8);
          String fileNameWithOutExt = FilenameUtils.getBaseName(pathName);
          fileNameWithOutExt = FilenameUtils.removeExtension(fileNameWithOutExt);
          vehicleList.add(vehicleFactory.createVehicle(json, fileNameWithOutExt));
        }catch (IOException e){
          System.out.println("invalid path");
        }
      }
    return vehicleList;
  }
}
