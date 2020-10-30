/**
 * 
 */

$('document').ready(function() {
	
	$('.table .btn-primary').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(penjualan, status){
			$('#id_penjualanEdit').val(penjualan.id_penjualan);
			$('#tanggal_penjualanEdit').val(penjualan.tanggal_penjualan);
			$('#harga_satuanEdit').val(penjualan.harga_satuan);
			$('#total_hargaEdit').val(penjualan.total_harga);
			$('#banyakEdit').val(penjualan.banyak);
		});			
		$('#editModal').modal();		
	});
	
	$('.table #detailsButton').on('click',function(event) {
		event.preventDefault();
		var href= $(this).attr('href');
		$.get(href, function(penjualan, status){
			$('#id_penjualanDetails').val(penjualan.id_penjualan);
			$('#tanggal_penjualanDetails').val(penjualan.tanggal_penjualan);
			$('#harga_satuanDetails').val(penjualan.harga_satuan);
			$('#total_hargaDetails').val(penjualan.total_harga);
			$('#total_hargaDetails').val(penjualan.banyak);
			$('#lastModifiedByDetails').val(penjualan.lastModifiedBy);
            $('#lastModifiedDateDetails').val(penjualan.lastModifiedDate.substr(0,19).replace("T", " "));
				});
		$('#detailsModal').modal();
	});
	
	$('.table #deleteButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#deleteModal #delRef').attr('href', href);
		$('#deleteModal').modal();		
	});	
});