ELEMENT.locale(ELEMENT.lang.ja)
var index = new Vue({
	el: '#app',
	name: 'PageA',
    methods: {
        onTenCardCLick: function () {
            window.location.href = "ten";
        },
    }
});