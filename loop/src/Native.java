public class Native {



        private int scvId;
        private String name;


        public Native (String name, int scvId){

            this.name = name;
            this.scvId = scvId;
        }


        public int getScvId(){
            String myScvId = "";
            myScvId = "SCV900"+scvId;
            return scvId;
        }

        public void getScvId(int scvId){
            this.scvId = scvId;
        }

        public String getName(){
            return name;
        }
    }

