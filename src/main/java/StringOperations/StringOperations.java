package StringOperations;

public class StringOperations {

    private String countryName;
    private String cityName;
    private String test;

    public StringOperations(String countryName, String cityName) {
        this.countryName = countryName;
        this.cityName = cityName;
    }

    public String concatenate(String countryName, String cityName){
        return countryName+cityName;
    }

    //or

    public String concat(String countryName, String cityName){
        countryName += cityName;
        return countryName;
    }

    public boolean contains(String countryName, String cityName){
        if(countryName.contains(cityName)) {
            return true;
        }else
            return false;
    }

    public String removeLetter(String countryName, String cityName){
        if(cityName.length()==1){
            countryName.replace(cityName, "");
        }
        return countryName;
    }


}
