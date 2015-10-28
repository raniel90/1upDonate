package br.com.upe.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;
 
@ManagedBean
public class DashBoardBean implements Serializable {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LineChartModel areaModelDoacoesPorSemana;
 
    @PostConstruct
    public void init() {
    	createAreaModelDoacoesPorSemana();
    }
 
    public LineChartModel getAreaModelDoacoesPorSemana() {
        return areaModelDoacoesPorSemana;
    }
     
    private void createAreaModelDoacoesPorSemana() {
    	areaModelDoacoesPorSemana = new LineChartModel();
 
        LineChartSeries doacoes = new LineChartSeries();
        doacoes.setFill(true);
        doacoes.setLabel("Doações");
        doacoes.set("1", 12);
        doacoes.set("2", 15);
        doacoes.set("3", 20);
        doacoes.set("4", 25);
 
        areaModelDoacoesPorSemana.addSeries(doacoes);
         
        areaModelDoacoesPorSemana.setTitle("Doadores por Campanha Semanal");
        areaModelDoacoesPorSemana.setLegendPosition("ne");
        areaModelDoacoesPorSemana.setStacked(true);
        areaModelDoacoesPorSemana.setShowPointLabels(true);
         
        Axis xAxis = new CategoryAxis("Semanas");
        areaModelDoacoesPorSemana.getAxes().put(AxisType.X, xAxis);
        Axis yAxis = areaModelDoacoesPorSemana.getAxis(AxisType.Y);
        yAxis.setLabel("Doadores");
        yAxis.setMin(0);
        yAxis.setMax(100);
    }
     
}
