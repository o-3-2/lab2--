
import java.util.ArrayList;
import java.util.Random;

public class Process {
    private int maxTimeProc;
    private String processId;
    private int prioritet;
    private ArrayList<Stream> Streams;
    public static final int TIME = 5;

    public Process(String processId, int prioritet) {
        this.processId = processId;
        this.prioritet = prioritet;
        Streams = new ArrayList<Stream>();
        Random length = new Random();
        for (int i = 0; i < length.nextInt(5) + 1; i++) {
            //Streams.add(new Stream("Ïîòîê " + (i + 1), 8 * i + 1, processId));
            this.maxTimeProc = Streams.get(i).getMaxTimeOfStream();
        }
    }

    public int getMaxTime() {
        return maxTimeProc;
    }

    public int getprioritet() {
        return prioritet;
    }

    public void Change() {
        prioritet = 0;
    }

    public ArrayList<Stream> getlist() {
        return Streams;
    }

    public String getId() {
        return processId;
    }
//
    

    public void print(String str, int i) {
		/*System.out.println(Streams.get(i).getProcId() + "  "
				+ Streams.get(i).getStreamId() + " ïðèîðèòåò : "
				+ getprioritet()+ " âðåìÿ: "
				+ Streams.get(i).getMaxTimeOfStream()
				+ str);*/
    }
}
