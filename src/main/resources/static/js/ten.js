ELEMENT.locale(ELEMENT.lang.ja)
var index = new Vue({
	el: '#app',
	data: {
        imageList: [10]
    },
	name: 'PageA',
    methods: {
    	showMessage: function () {
        	this.msg = 'こんにちわ';
        },
        onMainCardCLick: function () {
            window.location.href = "index";
        },
    }
});

gsap.to(
	"img",
 	{
  		delay: 1,
  		duration: 1.5,
  		y: -10, // 少し上に移動させる
  		opacity: 1,
  		ease: "power2.out",
  		// 複数要素を扱うプロパティ
  		stagger: {
    		from: "start", //左側から
    		amount: 1.6 // 0.8秒おきに
  		}
  	}
);