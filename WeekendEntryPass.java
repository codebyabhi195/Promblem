
class WeekendEntryPass {
    public static void main(String[] args) {
        boolean isWeekend = true;
        int currentHour = 21;

        boolean withinOpenHours = (currentHour >= 8 && currentHour <= 20);
        boolean freeEntry = (isWeekend && withinOpenHours);

        System.out.println(freeEntry);
    }
}