package CrtTask;

import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;

public class RightPane extends ScrollPane {
    public RightPane() {
        setMaxSize(500,600);
        setContent(new Label("main.py\n" +
                "from tkinter import *\n" +
                "from getweather import *\n" +
                "from matplotlib.backends.backend_tkagg import FigureCanvasTkAgg\n" +
                "from visualization import vis_7_day_weather\n" +
                "def set_1day_weather():\n" +
                "ret = get_weather(1)\n" +
                "data = '' for val in ret['daytime'].values():\n" +
                "data += val + '\\n' data += \"\\n\"\n" +
                "for val in ret['night'].values():\n" +
                "data += val + '\\n' weather.set(data)\n" +
                "def set_7day_weather():\n" +
                "ret = get_weather(7)\n" +
                "data = '' for i in range(7):\n" +
                "for val in ret[str(i)].values():\n" +
                "data += val + '\\n' data += '\\n' weather.set(data)\n" +
                "# Display the drawn graph to tkinter: create a canvas and place the fig on the canvas\n" +
                "canvas = FigureCanvasTkAgg(vis_7_day_weather(get_weather(7)), master=Tk())\n" +
                "canvas.draw()\n" +
                "canvas.get_tk_widget().pack(side=TOP, fill=BOTH, expand=YES)\n" +
                "app = Tk()\n" +
                "app.geometry('600x800')\n" +
                "app.wm_title('My Weather')\n" +
                "label = Label(\n" +
                "app, text='Beijing Weather Forecast',\n" +
                "font=('Times', '28', 'bold')\n" +
                ")\n" +
                "label.pack(pady=20)\n" +
                "button = Button(\n" +
                "app, text=\"Check today's weather\", font=('Arial', '14'), command=set_1day_weather\n" +
                ")\n" +
                "button.place(x=50, y=80, width=200)\n" +
                "button = Button(\n" +
                "app, text=\"Check 7 days' weather\", font=('Arial', '14'), command=set_7day_weather\n" +
                ")\n" +
                "button.place(x=350, y=80, width=200)\n" +
                "weather = StringVar()\n" +
                "weather.set('Welcome to use My Weather!')\n" +
                "msg = Message(\n" +
                "app, font=('Arial', '12'), width=500, textvariable=weather\n" +
                ")\n" +
                "msg.place(x=50, y=150, width=500)\n" +
                "app.mainloop()\n" +
                "getweather.py\n" +
                "from bs4 import BeautifulSoup\n" +
                "import requests\n" +
                "from datetime import datetime\n" +
                "def get_weather(num_days):\n" +
                "if int(num_days) == 1:\n" +
                "http = 'http://www.weather.com.cn/weather1d/101010100.shtml' # The weather in\n" +
                "Beijing\n" +
                "url = requests.get(http)\n" +
                "url.encoding = 'utf-8' text = url.text\n" +
                "soup = BeautifulSoup(text, 'lxml')\n" +
                "# There is an 8-hour time difference between world time and Beijing time: 17:00 PM in\n" +
                "Beijing is 9:00 UTC\n" +
                "h = datetime.utcnow().hour # Get the hour of world standard time\n" +
                "m = datetime.utcnow().minute # Get the minute of world standard time\n" +
                "print(h, m)\n" +
                "weather_info = {'title': None, 'wea': None,\n" +
                "'tem': None, 'win': None, 'sun': None}\n" +
                "weather = {'daytime': weather_info, 'night': weather_info.copy()}\n" +
                "# Determine if it is past 17:50 Beijing time\n" +
                "d = 1 # daytime flag\n" +
                "n = 2 # nighttime flag\n" +
                "if h > 9 or (h == 9 and m >= 50):\n" +
                "d, n = n, d # After 17:50, the day and night positions switch, so do the flag values\n" +
                "print(d, n)\n" +
                "# Obtain nighttime weather data\n" +
                "temp = soup.select(\n" +
                "'#today > div.t > ul > li:nth-child('+str(n)+') > p.tem > span')\n" +
                "weather['night']['tem'] = temp[0].string\n" +
                "temp = soup.select(\n" +
                "'#today > div.t > ul > li:nth-child('+str(n)+') > p.sun.sunDown > span')\n" +
                "weather['night']['sun'] = temp[0].string\n" +
                "temp = soup.select('#today > div.t > ul > li:nth-child('+str(n)+') > h1')\n" +
                "weather['night']['title'] = temp[0].string\n" +
                "temp = soup.select(\n" +
                "'#today > div.t > ul > li:nth-child('+str(n)+') > p.win > span')\n" +
                "weather['night']['win'] = temp[0].string\n" +
                "temp = soup.select(\n" +
                "'#today > div.t > ul > li:nth-child('+str(n)+') > p.wea')\n" +
                "weather['night']['wea'] = temp[0].string\n" +
                "# Obtain daytime weather data\n" +
                "temp = soup.select(\n" +
                "'#today > div.t > ul > li:nth-child('+str(d)+') > p.tem > span')\n" +
                "weather['daytime']['tem'] = temp[0].string\n" +
                "temp = soup.select('#today > div.t > ul > li:nth-child('+str(d)+') > h1')\n" +
                "weather['daytime']['title'] = temp[0].string\n" +
                "temp = soup.select(\n" +
                "'#today > div.t > ul > li:nth-child('+str(d)+') > p.win > span')\n" +
                "weather['daytime']['win'] = temp[0].string\n" +
                "temp = soup.select(\n" +
                "'#today > div.t > ul > li:nth-child('+str(d)+') > p.wea')\n" +
                "weather['daytime']['wea'] = temp[0].string\n" +
                "temp = soup.select(\n" +
                "'#today > div.t > ul > li:nth-child('+str(d)+') > p.sun.sunUp > span')\n" +
                "weather['daytime']['sun'] = temp[0].string\n" +
                "return weather\n" +
                "if int(num_days) == 7:\n" +
                "http = \"http://www.weather.com.cn/weather/101010100.shtml\" # The weather in\n" +
                "Beijing\n" +
                "url = requests.get(http)\n" +
                "url.encoding = \"utf-8\"\n" +
                "text = url.text\n" +
                "soup = BeautifulSoup(text, \"lxml\")\n" +
                "weather_info = { \"title\": None, \"wea\": None, \"dayTem\": None, \"nightTem\": None, \"win\": None}\n" +
                "# 7 days weather\n" +
                "weather = dict()\n" +
                "for i in range(7):\n" +
                "weather[str(i)] = weather_info.copy()\n" +
                "for i in range(7):\n" +
                "# :nth-child(n) The selector matches the Nth child of its parent element. css = soup.select(\"#\\\\37 d > ul > li:nth-child(\" +\n" +
                "str(i+1)+\") > h1\") # \\ is the escape character\n" +
                "weather[str(i)][\"title\"] = css[0].string\n" +
                "css = soup.select( \"#\\\\37 d > ul > li:nth-child(\" + str(i+1)+\") > p.wea\")\n" +
                "weather[str(i)][\"wea\"] = css[0].string\n" +
                "css = soup.select( \"#\\\\37 d > ul > li:nth-child(\" + str(i+1)+\") > p.tem>span \")\n" +
                "weather[str(i)][\"dayTem\"] = css[0].string+\"¡æ\" css = soup.select(\n" +
                "'#\\\\37 d > ul > li:nth-child(' + str(i+1) + ') > p.tem > i')\n" +
                "weather[str(i)][\"nightTem\"] = css[0].string\n" +
                "css = soup.select( \"#\\\\37 d > ul > li:nth-child(\" + str(i+1)+\") > p.win > i\")\n" +
                "weather[str(i)][\"win\"] = css[0].string\n" +
                "return weather\n" +
                "visualization.py\n" +
                "from matplotlib import pyplot as plt\n" +
                "from getweather import *\n" +
                "import datetime\n" +
                "def vis_7_day_weather(weather_dict):\n" +
                "dayTemList = []\n" +
                "nightTemList = []\n" +
                "dayList1 = ['today', 'tomorrow']\n" +
                "dayList2 = []\n" +
                "now = datetime.date.today()\n" +
                "for i in range(5):\n" +
                "date = (now + datetime.timedelta(days=i+2)).strftime('%a %b %d')\n" +
                "dayList2.append(date)\n" +
                "dayList = dayList1 + dayList2\n" +
                "for day in weather_dict.values():\n" +
                "dayTemList.append(int(day['dayTem'][:-1]))\n" +
                "nightTemList.append(int(day['nightTem'][:-1]))\n" +
                "fig = plt.figure(dpi=128, figsize=(10, 6))\n" +
                "plt.plot(dayList, dayTemList, c='r')\n" +
                "plt.plot(dayList, nightTemList, c='b')\n" +
                "plt.title(\"Daily high and low temperatures\", fontsize=24)\n" +
                "plt.xlabel('', fontsize=16)\n" +
                "fig.autofmt_xdate()\n" +
                "plt.ylabel(\"Temperature(¡æ)\", fontsize=16)\n" +
                "plt.tick_params(axis='both', which='major', labelsize=16)\n" +
                "return fig"));
    }
}
