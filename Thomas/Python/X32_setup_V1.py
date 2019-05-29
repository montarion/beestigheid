import ConfigParser

config = ConfigParser.ConfigParser()

config.add_section('settings')
config.set('settings', 'ip', '192.168.178.13')
config.set('settings', 'polltime', '200')

config.add_section('pins') 
config.set('pins','knop1','23')
config.set('pins','lamp1','24')
config.set('pins','knop2','20')
config.set('pins','lamp2','21')
config.set('pins','knop3','19')
config.set('pins','lamp3','26')
config.set('pins','knop4','6')
config.set('pins','lamp4','13')
config.set('pins','knop5','27')
config.set('pins','lamp5','22')
config.set('pins','knop6','5')
config.set('pins','lamp6','12')
config.set('pins','knop7','4')
config.set('pins','lamp7','17')
config.set('pins','knop8','16')
config.set('pins','lamp8','25')

with open('config.ini', 'wb') as file:
	config.write(file)
