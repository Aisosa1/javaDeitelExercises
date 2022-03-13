//package PurchaseReceipt;
//
//import java.util.ArrayList;
//
//public class Diary {
//    private String ownerName;
//    private ArrayList<Gist> gists;
//    private String password;
//
//    public Diary(String name, String secretKey) {
//        ownerName = name;
//        password = secretKey;
//    }
//    public String getOwnerName() {
//        return ownerName;
//    }
//    public void setOwnerName(String ownerName) {
//        this.ownerName = ownerName;
//    }
//    public ArrayList<Gist> getGists() {
//        return gists;
//    }
//    public void setGistFolder(ArrayList<Gist> gists) {
//        this.gists = gists;
//    }
//    public String getPassword() {
//        return password;
//    }
//    public void setPassword(String password) {
//        this.password = password;
//    }
//    public void addNewGist(String gistTitle, String fullGist, String secretKey) {
//        if (secretKey.equals(password)) {
//            Gist gist = new Gist(gistTitle, fullGist);
//            gists.add(gist);
//        } else {
//            throw new IllegalArgumentException("wrong password!!!Cannot Add Gist");
//        }
//    }
//    public Gist searchGistByTitle(String gistTitle) {
//        for (Gist gist : gists) {
//            if (gist.getTitle().equalsIgnoreCase(gistTitle)){
//            return gist;
//            }
//        }
//        throw new IllegalArgumentException("Gist not Found");
//    }
//    public Gist deleteGist(String gistTitle, String secretKey) {
//        for (Gist gist : gists) {
//        if (secretKey.equals(password) && (gist.getTitle().equalsIgnoreCase(gistTitle))){
//            gists.remove(gistTitle);
//            return gist;
//        }
//        }
//        throw new IllegalArgumentException("Wrong Password!!! Unable to delete!!");
//    }
//}
//
