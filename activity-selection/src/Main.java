import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Activity[] activities = {new Activity(9, 11), new Activity(10, 11), new Activity(11, 12), new Activity(12, 14), new Activity(13, 15), new Activity(15, 16)};
        System.out.println(activitySelection(activities));
    }
    private static List<Activity> activitySelection(Activity[] activities) {
        List<Activity> selectedActivities = new ArrayList<>();
        selectedActivities.add(activities[0]);
        int latestSelectedActivityIndex = 0;
        for (int i = 1; i < activities.length; i++) {
            if (selectedActivities.get(latestSelectedActivityIndex).endTime() <= activities[i].startTime()) {
                selectedActivities.add(activities[i]);
                latestSelectedActivityIndex++;
            }
        }
        return selectedActivities;
    }
}