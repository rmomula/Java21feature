public class StringTemplates {
    public static void main(String[] args) {

        var stringTemplate = """
                Hello,
                ${StringTemplate.subscribeCount()}!
                You have subscribed to Tech Gear Show
                """;
        //Bind the variable
        var subscribeCount = 10000;
        //Evaluate the string template
        String output = stringTemplate.resolve(subscribeCount);
        //Print the output
        System.out.println("output="+output);
    }
}
