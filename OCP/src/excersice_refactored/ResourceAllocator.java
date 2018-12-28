package excersice_refactored;

public class ResourceAllocator
{
    private static final int INVALID_RESOURCE_ID = -1;
    time_slot ts = new time_slot();
    space_slot ss = new space_slot();
    public int allocate(ResourceType resourceType)
    {
        int resourceId;
        switch (resourceType) {
        case TIME_SLOT:
            resourceId = ts.allocate();
            break;
        case SPACE_SLOT:
            resourceId = ss.allocate();
            break;
        default:
            System.out.println("ERROR: Attempted to allocate invalid resource");
            resourceId = INVALID_RESOURCE_ID;
            break;
        }
        return resourceId;
    }

    public void free(ResourceType resourceType, int resourceId)
    {
        switch (resourceType) {
        case TIME_SLOT:
            ts.markTimeSlotFree(resourceId);
            break;
        case SPACE_SLOT:
            ss.markSpaceSlotFree(resourceId);
            break;
        default:
            System.out.println("ERROR: attempted to free invalid resource");
            break;
        }
    }

}
