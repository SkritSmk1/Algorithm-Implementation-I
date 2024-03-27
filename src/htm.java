public class htm {
    public static void main(String[] args) {
        int status = 404; // Replace 404 with the desired HTTP status code
        String label;

        switch (status) {
            case 200:
                label = "OK (fulfilled)";
                break;
            case 403:
                label = "Forbidden";
                break;
            case 404:
                label = "Not Found";
                break;
            case 500:
                label = "Server Error";
                break;
            default:
                label = "Unknown Status";
                break;
        }

        System.out.println("Label: " + label);
    }
}