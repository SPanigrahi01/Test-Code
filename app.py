
from flask import Flask, request
import pickle
import base64
import os

app = Flask(__name__)

@app.route('/unpickle', methods=['POST'])
def unpickle_object():
    # Existing Insecure Deserialization vulnerability
    # Additional code not shown for brevity

@app.route('/run_command', methods=['GET'])
def run_command():
    command = request.args.get('command')
    # Vulnerable to Command Injection
    output = os.popen(command).read()
    return f"Command output: {output}"

if __name__ == '__main__':
    app.run(debug=True)
