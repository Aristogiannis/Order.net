from flask import Flask, jsonify, request, Response
import json
from flask_cors import CORS, cross_origin
import datetime

app = Flask(__name__)
cors = CORS(app)
table_num = 0;
orders= []
put_bill = []
app.config['CORS_HEADERS'] = 'application/json'

@app.route('/order', methods=['PUT'])
@cross_origin()
def submitorder():
    request_order = request.get_json()
    orders.append(request_order)
    now = datetime.datetime.now()
    check_txt = open("order_test.txt", "r")
    check_txt2 = open("order_test.txt", "w")
    ords = str(orders)  
    tst = str(check_txt.read)
    check_txt2.write(tst + now.strftime("%Y-%m-%d %H:%M:%S") + "\n" + ords + now.strftime("%Y-%m-%d %H:%M:%S"))
    response = Response("successfully submitted order", status=200)
    return response

@app.route('/all', methods=['GET'])
def get_all_orders():
    return jsonify(orders)

        
@app.route('/order/<int:num>', methods=['GET'])    
def get_by_tablenum(num):
    for table in orders:
        if table['tablenum']==num:
            return jsonify(table)
    return Response('invalid table number', status=404)

@app.route('/menu', methods = ['GET'])
def get_menu():
    menu_txt = open("Menu.txt", "r")
    menu_fin = menu_txt.read()
    response = str(menu_fin)
    return response

@app.route('/bill/<string:tableid>', methods=['PUT'])
def ask_for_bill(tableid):
    put_bill.append(tableid)
    return Response("table successfully asked for the bill", status=200)

@app.route('/bill/all', methods=['GET'])
def get_all_bills():
    return jsonify(put_bill)

app.run(port=5000, host='0.0.0.0')
