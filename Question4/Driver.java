public class Driver {
    public static void main(String[] args) {
        Folder demo1 = new Folder("php_demo1");
        demo1.addFolder("_Source Files");
        demo1.addFolder("Include Path");
        demo1.addFolder("Remote Files");

        demo1.folders.get(0).addFolder(".phalcon");
        demo1.folders.get(0).addFolder("_app");
        demo1.folders.get(0).addFolder("_cache");
        demo1.folders.get(0).addFolder("_public");
        demo1.folders.get(0).addFile(".htaccess");
        demo1.folders.get(0).addFile(".htrouter.php");
        demo1.folders.get(0).addFile("index.html");

        demo1.folders.get(0).folders.get(1).addFolder("_config");
        demo1.folders.get(0).folders.get(1).addFolder("_controllers");
        demo1.folders.get(0).folders.get(1).addFolder("library");
        demo1.folders.get(0).folders.get(1).addFolder("migrations");
        demo1.folders.get(0).folders.get(1).addFolder("_models");
        demo1.folders.get(0).folders.get(1).addFolder("_views");

        demo1.display();

        // remove folder 'app'
        System.out.println("app removed:");
        demo1.folders.get(0).folders.remove(1);
        demo1.display();

        // remove folder 'public'
        System.out.println("public removed:");
        demo1.folders.get(0).folders.remove(2);
        demo1.display();
    }
}
