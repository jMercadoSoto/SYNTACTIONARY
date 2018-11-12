# coding:utf-8
import requests
from urllib import urlopen
from bs4 import BeautifulSoup

html = urlopen('https://www.cnn.com/')
bsObj = BeautifulSoup(html, 'html.parser')
t1 = bsObj.find_all('a')
for t2 in t1:
    t3 = t2.get('href')
    print(t3)


from lxml import html
url='https://www.cnn.com/2018/10/27/politics/trump-jba-death-penalty-pittsburgh/index.html'
page=requests.Session().get(url)
tree=html.fromstring(page.text)
result=tree.xpath('//div[@class="l-container"]//div/text()')
print(type(result))
print(result)
print(1)
'''
for i in result:
    if i == '\u2022':
        print(111111)
        result.remove(u"\u2022")
    result.remove('read')
    result.remove('more')
'''
fo=open('1.txt','w')
for ip in result:
    fo.write(ip)
    fo.write('\n')
fo.close()
