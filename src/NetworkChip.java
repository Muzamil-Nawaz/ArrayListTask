public class NetworkChip {
    Connector type;
    NetworkChip(){}
    NetworkChip(Connector c){
       this.type = c;
    }
    public String sendData(String data) throws Exception{
       
            if(data.isEmpty() || data == null){
                throw new DataErrorException("DataErrorException");
            
            }
            return "";
    }     
       
}
