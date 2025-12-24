from flask import send_from_directory,Flask
app=Flask(__name__)
@app.route("/favicon.ico")
def favicon():
    return send_from_directory("static", "favicon.ico", mimetype="image/vnd.microsoft.icon")
