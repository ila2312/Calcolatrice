package com.example.calcolatrice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label _screen;

    @FXML
    private Button _b1;

    @FXML
    private Button _b2;

    @FXML
    private Button _b3;

    @FXML
    private Button _b4;

    @FXML
    private Button _b5;

    @FXML
    private Button _b6;

    @FXML
    private Button _b7;

    @FXML
    private Button _b8;

    @FXML
    private Button _b9;

    @FXML
    private Button _b0;

    @FXML
    private Button _plus;

    @FXML
    private Button _min;

    @FXML
    private Button _equal;

    @FXML
    private Button _canc;

    @FXML
    public void handleButtonAction(ActionEvent event){
        if(_screen.getText().isEmpty()) {
            _plus.setDisable(false);
            _min.setDisable(false);
        }

        if(event.getSource() == _b1) {
            _screen.setText( _screen.getText() + "1" );
        } else if(event.getSource() == _b2) {
            _screen.setText( _screen.getText() + "2" );
        } else if(event.getSource() == _b3) {
            _screen.setText( _screen.getText() + "3" );
        } else if(event.getSource() == _b4) {
            _screen.setText( _screen.getText() + "4" );
        } else if(event.getSource() == _b5) {
            _screen.setText( _screen.getText() + "5" );
        } else if(event.getSource() == _b6) {
            _screen.setText( _screen.getText() + "6" );
        } else if(event.getSource() == _b7) {
            _screen.setText( _screen.getText() + "7" );
        } else if(event.getSource() == _b8) {
            _screen.setText( _screen.getText() + "8" );
        } else if(event.getSource() == _b9) {
            _screen.setText( _screen.getText() + "9" );
        } else if(event.getSource() == _b0) {
            _screen.setText( _screen.getText() + "0" );
        }

        if(_flagSign != 0) {
            _equal.setDisable(false);
        }
    }

    @FXML
    private String _firstNumber;

    @FXML
    private int _flagSign = 0; //1: piu, 2: meno, 0: nessuno

    @FXML
    public void handleButtonPlus(ActionEvent event){
        _firstNumber = _screen.getText();
        _flagSign = 1;
        _plus.setDisable(true);
        _min.setDisable(true);
        if(event.getSource() == _plus) {
            _screen.setText( _screen.getText() + "+" );
        }
    }

    @FXML
    public void handleButtonMin(ActionEvent event){
        _firstNumber = _screen.getText();
        _flagSign = 2;
        _min.setDisable(true);
        _plus.setDisable(true);
        if(event.getSource() == _min) {
            _screen.setText( _screen.getText() + "-" );
        }
    }

    @FXML
    public void handleButtonEqual(ActionEvent event) {
        String _otherNumber;
        int _result = 0;
        _equal.setDisable(true);
        System.out.println(_flagSign);
        switch (_flagSign) {
            case 1:
                _otherNumber = _screen.getText().substring(_screen.getText().indexOf('+'));
                _result = Integer.parseInt(_firstNumber) + Integer.parseInt(_otherNumber);
                break;
            case 2:
                _otherNumber = _screen.getText().substring(_screen.getText().indexOf('-'));
                _result = Integer.parseInt(_firstNumber) + Integer.parseInt(_otherNumber);
                break;
            default:
                break;
        }
        _screen.setText(""+_result);
    }

    @FXML
    public void handleButtonCanc(ActionEvent event) {
        _screen.setText("");
        _flagSign = 0;
        _plus.setDisable(true);
        _min.setDisable(true);
        _equal.setDisable(true);
    }
}