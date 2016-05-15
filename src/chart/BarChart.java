package chart;

//import .*;
import java.io.IOException;
import javafx.scene.chart.CategoryAxis;
import org.jfree.chart.*;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.*;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.*;

public class BarChart extends ApplicationFrame {
    public BarChart(final String title) throws IOException {
        super(title);
        final CategoryDataset dataset = createDataset();
        final JFreeChart graphe = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(graphe);
        chartPanel.setPreferredSize(new java.awt.Dimension(400, 400));
        setContentPane(chartPanel);
    }
public CategoryDataset createDataset() throws IOException {
        // 0. Création d'un diagramme.
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
       //Valeurs statiques
        dataset.addValue(10, "2015", " ");
        dataset.addValue(12, " 2013", " ");
        dataset.addValue(25, "2021", " ");
        dataset.addValue(19, "2011", " ");
       return dataset;
       
    }
	public JFreeChart createChart(CategoryDataset dataset) {
        final JFreeChart chart = ChartFactory.createBarChart3D(
                " le taux des cartes de fidelite ", // chart title
                " ", // domain axis label
                "  Le nombre des points de fidelite ", // range axis label
                dataset, // data
                PlotOrientation.VERTICAL, // orientation
                true, // include legend
                true, // tooltips
                true // urls
                );

 final CategoryPlot plot = chart.getCategoryPlot();
        final org.jfree.chart.axis.CategoryAxis axis = plot.getDomainAxis();
        axis.setCategoryLabelPositions(CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 2.0));
        final org.jfree.chart.renderer.category.CategoryItemRenderer renderer = plot.getRenderer();
        renderer.setItemLabelsVisible(true); 
        return chart;
    }
    public static void main(final String[] args) throws IOException {
        final BarChart demo = new BarChart("statistiques des cartes de fidelites ");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

    }
}
