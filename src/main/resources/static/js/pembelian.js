/**
 * 
 */

$('document').ready(function() {
	
	$('.table .btn-primary').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(pembelian, status){
			$('#id_pembelianEdit').val(pembelian.id_pembelian);
			$('#tanggal_pembelianEdit').val(pembelian.tanggal_pembelian);
			$('#ddlCountryEdit').val(pembelian.pemasokId);
			$('#nama_barang_pembelianEdit').val(pembelian.nama_barang_pembelian);
			$('#harga_satuan_pembelianEdit').val(pembelian.harga_satuan_pembelian);
			$('#banyak_pembelianEdit').val(pembelian.banyak_pembelian);
			$('#total_harga_pembelianEdit').val(pembelian.total_harga_pembelian);
			$('#remarksEdit').val(pembelian.remarks);
		});			
		$('#editModal').modal();		
	});
	
	$('.table #detailsButton').on('click',function(event) {
		event.preventDefault();
		var href= $(this).attr('href');
		$.get(href, function(pembelian, status){
			$('#id_pembelianDetails').val(pembelian.id_pembelian);
			$('#tanggal_pembelianDetails').val(pembelian.tanggal_pembelian);
			$('#ddlCountryDetails').val(pembelian.pemasokId);
			$('#nama_barang_pembelianDetails').val(pembelian.nama_barang_pembelian);
			$('#harga_satuan_pembelianDetails').val(pembelian.harga_satuan_pembelian);
			$('#banyak_pembelianDetails').val(pembelian.banyak_pembelian);
			$('#total_harga_pembelianDetails').val(pembelian.total_harga_pembelian);
			$('#remarksDetails').val(pembelian.remarks);
			$('#lastModifiedByDetails').val(pembelian.lastModifiedBy);
            $('#lastModifiedDateDetails').val(pembelian.lastModifiedDate.substr(0,19).replace("T", " "));
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