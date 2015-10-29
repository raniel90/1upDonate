package br.com.upe.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;
import org.primefaces.model.chart.MeterGaugeChartModel;
 
@ManagedBean
public class DashBoardBean implements Serializable {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LineChartModel areaModelDoacoesPorSemana;
	private MeterGaugeChartModel meterGaugeDoacoesDia;
 
    @PostConstruct
    public void init() {
    	createAreaModelDoacoesPorSemana();
    	createMeterGaugeDoacoesDoDia();
    }
 
    public LineChartModel getAreaModelDoacoesPorSemana() {
        return areaModelDoacoesPorSemana;
    }
     
    public MeterGaugeChartModel getMeterGaugeDoacoesDia() {
		return meterGaugeDoacoesDia;
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
        areaModelDoacoesPorSemana.setSeriesColors("cc0000, cc0000, cc0000, cc0000");
         
        Axis xAxis = new CategoryAxis("Semanas");
        areaModelDoacoesPorSemana.getAxes().put(AxisType.X, xAxis);
        Axis yAxis = areaModelDoacoesPorSemana.getAxis(AxisType.Y);
        yAxis.setLabel("Doadores");
        yAxis.setMin(0);
        yAxis.setMax(100);
    }
    
    private MeterGaugeChartModel initMeterGaugeModel() {
        @SuppressWarnings("serial")
		List<Number> intervals = new ArrayList<Number>(){{
            add(10);
            add(20);
            add(50);
            add(100);
        }};
         
        return new MeterGaugeChartModel(30, intervals);
    }
    
    private void createMeterGaugeDoacoesDoDia() {
         
        meterGaugeDoacoesDia = initMeterGaugeModel();
        meterGaugeDoacoesDia.setTitle("Doações por dia");
        meterGaugeDoacoesDia.setSeriesColors("66cc66,93b75f,E7E658,cc6666");
        meterGaugeDoacoesDia.setGaugeLabel("Doções");
        meterGaugeDoacoesDia.setGaugeLabelPosition("bottom");
        meterGaugeDoacoesDia.setLabelHeightAdjust(110);
        meterGaugeDoacoesDia.setIntervalOuterRadius(100);
    }
     
}
