
public class Phone{
    private String areaCode;
    private String exchange;
    private String extention;

    public String getAreaCode() {
        return areaCode;
    }

    public String getExchange() {
        return exchange;
    }

    public String getExtention() {
        return extention;
    }

    public String getPhoneString(){
        String test = "%s%s%s";
        String result = String.format(test, this.areaCode, this.exchange, this.extention);
        return result;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public void setExtention(String extention) {
        this.extention = extention;
    }
}
