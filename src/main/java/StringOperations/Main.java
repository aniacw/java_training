package StringOperations;

public class Main {
    public static void main(String[] args){
        StringOperations stringOperations = new StringOperations("Spain", "Madrid");

        String result = stringOperations.concatenate("Spain", "Madrid");
        System.out.println(result);

        String result2 = stringOperations.concat("UK", "London");
        System.out.println(result2);

        //String test = countryName.concat(cityName);

        boolean resultContains = stringOperations.contains("Brasil", "Bras");
        System.out.println(resultContains);

        String resultRemoveLetter = stringOperations.removeLetter("Taiwan", "i");
        System.out.println(resultRemoveLetter);

    }
}
