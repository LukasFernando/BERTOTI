public class Model {
    public static Model model;

    private Model(){

    }

    public static Model getInstance(){
        if (model == null){
            return new Model();
        }
        else{
            return model;
        }
    }
}
