package Family;

public class Husband {
    private Wife iyawo;

    public Husband (Wife wife){
        iyawo = wife;
    }

    public void askWifeToCook(String cookWhat){
        System.out.println("begging my wife to cook");
        switch (cookWhat){
            case "indomie":
                System.out.println("get lost");
                break;
            default:
            iyawo.cook();

            }
        }

        public Wife getIyawo(){
        return iyawo;
        }

        public void setIyawo(Wife iyawo){
        this.iyawo = iyawo;
        }
    }

