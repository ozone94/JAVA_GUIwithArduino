/*
 * title           :Adding serial communication data to a real-time Java graph
 * author          :Poschanan Thongsri id 6001012620033 and Jirapa Dadee id 6001012630012
 * blog            :https://poschanan.blogspot.com/ and http://jirapad.blogspot.com/2018/09/blog-post.html?view=mosaic
 * Thank you and reference for code and knowledge : https://www.youtube.com/watch?v=cw31L_OwX3A&t=2698s
                                                    https://crunchify.com/how-to-read-json-object-from-file-in-java/
                                                    https://www.thaicreate.com/java/java-json-create.html
                                                    https://www.youtube.com/watch?v=cFCgFlqF5kw
                                                    https://www.youtube.com/watch?v=6xGihZDvOA0
                                                    https://www.youtube.com/watch?v=J2zRhNb5pjw
                                                    https://www.youtube.com/watch?v=wDVH3qnXv74
 */
package VoltageControl;



import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class graph {
    public static void main(String[] arge){
        
        //window
        JFrame window = new JFrame();
        window.setTitle("Graph");
        window.setSize(600,400);
        //window.setLayout(new BorderLayout());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //drop-down box
        JComboBox<String> portList = new JComboBox<String>();
        JButton connectBT = new JButton("Connect");
        JPanel topPanel = new JPanel();
        topPanel.add(portList);
        topPanel.add(connectBT);
        window.add(topPanel,BorderLayout.NORTH );
        
        // create the line graph
        XYSeries series = new XYSeries("Reading");
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        JFreeChart chart = ChartFactory.createXYAreaChart("", "Time", "DC Reading", dataset, PlotOrientation.VERTICAL, true, true, false);
        window.add(new ChartPanel(chart),BorderLayout.BEFORE_LINE_BEGINS);
        
        window.setVisible(true);
        
    }

}