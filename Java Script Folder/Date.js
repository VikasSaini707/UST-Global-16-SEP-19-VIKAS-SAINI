var todaydate=new Date()
console.log("Today date = ",todaydate)

console.log('Day= ',todaydate.getDay())
console.log('Year= ',todaydate.getFullYear())
console.log('Month= ',todaydate.getMonth())
console.log('Date= ',todaydate.getDate())
var constMilli=new Date(0)
console.log('Date = ',constMilli);
var constString=new Date('Nov 10')
console.log('Date String Construtor= ',constString);
var constYear=new Date(2017,10)
console.log('Date Year Construtor= ',constYear);


var day=todaydate.getDay();
var ar=['sun','mon','tue','Wed','thur','fri','sat']
console.log('Day is ',ar[day]+'day');

var month=todaydate.getMonth()
var m=['jan','feb','mar','april','may','june','july','aug','sept','oct','nov','dec']
console.log('Month is ',m[month]);
