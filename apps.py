from flask import Flask, render_template, request,send_from_directory
import os

app = Flask(__name__)

# Route for the home page that renders the form
@app.route('/')
def index():
    return render_template('index.html')
@app.route('/favicon.ico')  # Route to handle the favicon.ico request
def favicon():
    return send_from_directory(os.path.join(app.root_path, 'static'), 'favicon.ico', mimetype='image/vnd.microsoft.icon')



# Route to handle the form submission

if __name__ == '__main__':
    app.run(port=8090)
