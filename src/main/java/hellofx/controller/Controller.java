package hellofx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class Controller {

    @FXML 
    private Tab distancia;
    
    @FXML private ToggleGroup opciones11;

    @FXML private RadioButton op11;

    @FXML private RadioButton op12;

    @FXML private RadioButton op13;

    @FXML private Button convertir_distancia;

    @FXML private TextField ingresarDistancia;
    
    @FXML private ToggleGroup opciones12;

    @FXML private RadioButton op14;

    @FXML private RadioButton op15;

    @FXML private RadioButton op16;

    @FXML private Label resultadoDistancia;
    
    @FXML
    void convertirDistancia(ActionEvent event) {
        if(opciones11.getSelectedToggle().equals(op11)){
            if(opciones12.getSelectedToggle().equals(op14)){
                double d = Double.parseDouble(ingresarDistancia.getText());
                resultadoDistancia.setText(String.format("%.2f", d) + " Mts");  
            }
            else if(opciones12.getSelectedToggle().equals(op15)){
                double d = Double.parseDouble(ingresarDistancia.getText());
                d *= 39.37008;
                resultadoDistancia.setText(String.format("%.2f", d) + " Pulg");
            }
            else if (opciones12.getSelectedToggle().equals(op16)){
                double d = Double.parseDouble(ingresarDistancia.getText());
                d *= 3.28084;
                resultadoDistancia.setText(String.format("%.2f", d) + " Pies");
            }
        }
        else if(opciones11.getSelectedToggle().equals(op12)){
            if(opciones12.getSelectedToggle().equals(op14)){
                double d = Double.parseDouble(ingresarDistancia.getText());
                d *= 0.0254;
                resultadoDistancia.setText(String.format("%.2f", d) + " Mts");
            }
            else if(opciones12.getSelectedToggle().equals(op15)){
                double d = Double.parseDouble(ingresarDistancia.getText());
                resultadoDistancia.setText(String.format("%.2f", d) + " Pulg");
            }
            else if (opciones12.getSelectedToggle().equals(op16)){
                double d = Double.parseDouble(ingresarDistancia.getText());
                d *= 0.0833;
                resultadoDistancia.setText(String.format("%.2f", d) + " Pies");
            }
        }
        else if(opciones11.getSelectedToggle().equals(op13)){
            if(opciones12.getSelectedToggle().equals(op14)){
                double d = Double.parseDouble(ingresarDistancia.getText());
                d *= 0.3048;
                resultadoDistancia.setText(String.format("%.2f", d) + " Mts");
            }
            else if(opciones12.getSelectedToggle().equals(op15)){
                double d = Double.parseDouble(ingresarDistancia.getText());
                d *= 12;
                resultadoDistancia.setText(String.format("%.2f", d) + " Pulg");
            }
            else if (opciones12.getSelectedToggle().equals(op16)){
                double d = Double.parseDouble(ingresarDistancia.getText());
                resultadoDistancia.setText(String.format("%.2f", d) + " Mts");
            }
        }
    }

    
    @FXML 
    private Tab masa;
    
    @FXML private ToggleGroup opciones21;

    @FXML private RadioButton op21;

    @FXML private RadioButton op22;

    @FXML private RadioButton op23;

    @FXML private Button convertir_masa;

    @FXML private TextField ingresarMasa;
    
    @FXML private ToggleGroup opciones22;

    @FXML private RadioButton op24;

    @FXML private RadioButton op25;

    @FXML private RadioButton op26;

    @FXML private Label resultadoMasa;
    
    @FXML
    void convertirMasa(ActionEvent event) {
        if(opciones21.getSelectedToggle().equals(op21)){
            if(opciones22.getSelectedToggle().equals(op24)){
                double d = Double.parseDouble(ingresarMasa.getText());
                resultadoMasa.setText(String.format("%.2f", d) + " Kg");
            }
            else if(opciones22.getSelectedToggle().equals(op25)){
                double d = Double.parseDouble(ingresarMasa.getText());
                d *= 2.20462;
                resultadoMasa.setText(String.format("%.2f", d) + " Libras");
            }
            else if (opciones22.getSelectedToggle().equals(op26)){
                double d = Double.parseDouble(ingresarMasa.getText());
                d *= 35.2739;
                resultadoMasa.setText(String.format("%.2f", d) + " Onz");
            }
        }
        else if(opciones21.getSelectedToggle().equals(op22)){
            if(opciones22.getSelectedToggle().equals(op24)){
                double d = Double.parseDouble(ingresarMasa.getText());
                d *= 0.4535;
                resultadoMasa.setText(String.format("%.2f", d) + " Kg");
            }
            else if(opciones22.getSelectedToggle().equals(op25)){
                double d = Double.parseDouble(ingresarMasa.getText());
                resultadoMasa.setText(String.format("%.2f", d) + " Libras");
            }
            else if (opciones22.getSelectedToggle().equals(op26)){
                double d = Double.parseDouble(ingresarMasa.getText());
                d *= 15.99;
                resultadoMasa.setText(String.format("%.2f", d) + " Onz");
            }
        }
        else if(opciones21.getSelectedToggle().equals(op23)){
            if(opciones22.getSelectedToggle().equals(op24)){
                double d = Double.parseDouble(ingresarMasa.getText());
                d *= 0.0283;
                resultadoMasa.setText(String.format("%.2f", d) + " Kg");
            }
            else if(opciones22.getSelectedToggle().equals(op25)){
                double d = Double.parseDouble(ingresarMasa.getText());
                d *= 0.0624;
                resultadoMasa.setText(String.format("%.2f", d) + " Mts");
            }
            else if (opciones22.getSelectedToggle().equals(op26)){
                double d = Double.parseDouble(ingresarMasa.getText());
                resultadoMasa.setText(String.format("%.2f", d) + " Mts");
            }
        }
    }

    
    @FXML
    private Tab datos;
    
    @FXML private ToggleGroup opciones31;

    @FXML private RadioButton op31;

    @FXML private RadioButton op32;

    @FXML private RadioButton op33;

    @FXML private Button convertir_datos;

    @FXML private TextField ingresarDatos;
    
    @FXML private ToggleGroup opciones32;

    @FXML private RadioButton op34;

    @FXML private RadioButton op35;

    @FXML private RadioButton op36;

    @FXML private Label resultadoDatos;

    @FXML
    void convertirDatos(ActionEvent event) {
        if(opciones31.getSelectedToggle().equals(op31)){
            if(opciones32.getSelectedToggle().equals(op34)){
                double d = Double.parseDouble(ingresarDatos.getText());
                resultadoDatos.setText(String.format("%.2E", d) + " KB");
            }
            else if(opciones32.getSelectedToggle().equals(op35)){
                double d = Double.parseDouble(ingresarDatos.getText());
                d *= 0.001;
                resultadoDatos.setText(String.format("%.2E", d) + " MB");
            }
            else if (opciones32.getSelectedToggle().equals(op36)){
                double d = Double.parseDouble(ingresarDatos.getText());
                d *= 0.000001;
                resultadoDatos.setText(String.format("%.2E", d) + " GB");
            }
        }
        else if(opciones31.getSelectedToggle().equals(op32)){
            if(opciones32.getSelectedToggle().equals(op34)){
                double d = Double.parseDouble(ingresarDatos.getText());
                d *= 1000;
                resultadoDatos.setText(String.format("%.2E", d) + " KB");
            }
            else if(opciones32.getSelectedToggle().equals(op35)){
                double d = Double.parseDouble(ingresarDatos.getText());
                resultadoDatos.setText(String.format("%.2E", d) + " MB");
            }
            else if (opciones32.getSelectedToggle().equals(op36)){
                double d = Double.parseDouble(ingresarDatos.getText());
                d *= 0.001;
                resultadoDatos.setText(String.format("%.2E", d) + " GB");
            }
        }
        else if(opciones31.getSelectedToggle().equals(op33)){
            if(opciones32.getSelectedToggle().equals(op34)){
                double d = Double.parseDouble(ingresarDatos.getText());
                d *= 1000000;
                resultadoDatos.setText(String.format("%.2E", d) + " KB");
            }
            else if(opciones32.getSelectedToggle().equals(op35)){
                double d = Double.parseDouble(ingresarDatos.getText());
                d *= 1000;
                resultadoDatos.setText(String.format("%.2E", d) + " MB");
            }
            else if (opciones32.getSelectedToggle().equals(op36)){
                double d = Double.parseDouble(ingresarDatos.getText());
                resultadoDatos.setText(String.format("%.2E", d) + " GB");
            }
        }
    }

}